package com.model.oop;

public class Person {
	
	private static final int CPF_SIZE = 11;
	private static final int CNPJ_SIZE = 14;
	
	private Integer code;
	private String name;
	private String document;
	private TypePerson typePerson;
	
	
	public Person() {
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		if(document.isEmpty() || document.isBlank() || document == null) {
			throw new RuntimeException("Document is not valid!");
		}		
		
		if (document.length() == CPF_SIZE) {
			setDocument(document, TypePerson.PHYSICAL);
		} else if (document.length() == CNPJ_SIZE) {
			setDocument(document,TypePerson.LEGAL);
		} else {
			throw new RuntimeException("Document is not valid!");
		} 
	}
	
	private void setDocument(String document, TypePerson typePerson) {
		this.document = document;
		this.typePerson = typePerson;
	}

	public TypePerson getTypePerson() {
		return typePerson;
	}

	public void setTypePerson(TypePerson typePerson) {
		this.typePerson = typePerson;
	}
	

	@Override
	public String toString() {
		return "[code=" + code + ", name=" + name + ", document=" + document + ", type=" + typePerson + "]";
	}

}
