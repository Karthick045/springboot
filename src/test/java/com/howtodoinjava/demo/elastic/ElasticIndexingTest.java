package com.howtodoinjava.demo.elastic;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticIndexingTest {
	
	@Autowired
	Client elasticClient;
	
	@Test
	public void prepareIndex() {
		String jsonObject = "{\"age\":10,\"dateOfBirth\":1471466076564,"
			      +"\"fullName\":\"John Doe\"}";
			    IndexResponse response = elasticClient.prepareIndex("people", "Doe")
			      .setSource(jsonObject, XContentType.JSON).get();
			    System.out.println("karthik");
	}
}
