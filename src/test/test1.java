/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import back.entities.AccountingFiles;
import back.entities.AccountingFilesDetails;
import back.entities.GoodsKind;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;

/**
 *
 * @author Hassa_000
 */
public class test1 {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("HalPU");
        em = emf.createEntityManager();
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("javax.persistence.jdbc.password", "Hassan");
        properties.put("javax.persistence.jdbc.driver", "org.hsqldb.jdbcDriver");
        properties.put("javax.persistence.jdbc.user", "Hassan");
        List<AccountingFiles> accountingList = em.createNamedQuery("AccountingFiles.findAll").getResultList();
        for (AccountingFiles files : accountingList) {
            if (files.getAccountingFilesActiveStatus() == true);
            List<AccountingFilesDetails> details = files.getAccountingFilesDetailsList();
            for (AccountingFilesDetails detail : details) {
                if (detail.getActiveStatus() == true) {
                    properties.put("javax.persistence.jdbc.url", "jdbc:hsqldb:file:" + detail.getFilePath()+";shutdown=true");
                }
            }
        }
          
   
        em.close();
        emf.close();

        emf = Persistence.createEntityManagerFactory("HalPU", properties);
        em = emf.createEntityManager();
        List<GoodsKind> goods = em.createNamedQuery("GoodsKind.findAll").getResultList();
        for (GoodsKind g : goods) {
            System.out.println(g.getKindName());
        }
        Map <String ,Object> pro = emf.getProperties();
        System.out.println(pro);
       /* em.getTransaction().begin();
   em.createNativeQuery("shutdown").executeUpdate();
   em.getTransaction().commit();*/
        em.close();
        emf.close();

    }

}
