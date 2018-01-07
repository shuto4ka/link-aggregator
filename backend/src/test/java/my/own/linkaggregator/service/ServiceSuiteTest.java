//package my.own.linkaggregator.backend.service;
//
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.ClassRule;
//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.testcontainers.containers.GenericContainer;
//@RunWith(Suite.class)
//@Suite.SuiteClasses({LinkServiceImplTest.class})
//public class ServiceSuiteTest {
//
////    @ClassRule
////    public PostgreSQLContainer postgres = new PostgreSQLContainer();
//    public static GenericContainer postgres;
//
//    @BeforeClass
//    public static void setUp() throws Exception {
//        postgres = new GenericContainer("postgres:9.6").withExposedPorts(6379);
//        postgres.start();
//    }
//
//}