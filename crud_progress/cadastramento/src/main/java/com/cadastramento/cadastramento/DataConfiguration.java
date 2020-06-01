//package com.cadastramento.cadastramento;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//@Configuration
//public class DataConfiguration {
//
//		@Bean
//		public DataSource dataSource() {
//			DriverManagerDataSource dataSource = new DriverManagerDataSource();
//			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//			dataSource.setUrl("jdbc:mysql://localhost:3306/cadastramento");
//			dataSource.setUsername("root");
//			dataSource.setPassword("root123");
//			return dataSource;
//		}
//
//		@Bean
//		public JpaVendorAdapter jpaVendorAdapter() {
//			//Criando Conexão com o Hibernate
//			HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//			//Definindo qual DataBase Utilizando
//			adapter.setDatabase(Database.MYSQL);
//			//True => Mostrando as etapas quando for deletar, ou inserir no console
//			adapter.setShowSql(true);
//			//Criar as Tabelas Automaticamente
//			adapter.setGenerateDdl(true);
//			//Dialeto utilizado
//			adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
//			//Criar as Tabelas Automaticamente
//			adapter.setPrepareConnection(true);
//
//			return adapter;
//		}
//}
//
////ESSE ÚLTIMO MÉTODO, ESTAREI EFETUANDO TESTES, POIS O REAL PROBLEMA PODE SER DELE.
////CONSISTE BASICAMENTE EM CRIAR A TABELA SOZINHA. ACHO QUE A MELHOR SOLUÇÃO SERÁ CRIAR
////AS TABELAS MANUALMENTE, PARA AO EXECUTAR O PROGRAMA POSSAMOS INSERIR
