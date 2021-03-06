package com.elastic.crud.service;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateResponse;

import com.elastic.crud.model.Student;

public interface ElasticConnectService {
	public Map<String, Object> addStudent(String index,Student student,HttpSession httpSession);
	SearchResponse getStudent(String index,HttpSession httpSession) throws IOException;
	Student getStudentById(String index,String id,String field,String fieldValue,HttpSession httpSession);
	public boolean deleteStudentById(String index,String id);
	public boolean deleteIndex(String index);
	public UpdateResponse updateStudentDetails(String index,String id,Student student,HttpSession httpSession) throws IOException;
}