package com.gmoodle.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="document")
public class Document implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDocument;
	
	/**
	 * Relation ManyToOne from Document to Activity
	 * @JoinColumn: will add the column with that name into the actual table
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idActivity")
    private Activity activity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUser")
    private Users users;
	
	@NotEmpty(message ="can not be empty")
	@Column(nullable=false)
	private String pathDoucument;
	
	@NotNull(message="can not be empty")
	@Column(nullable=false)
	private boolean isCheck;
	
	@NotNull(message="can not be empty")
	@Column(nullable=false)
	private boolean isEnableDocument;
	
	/**
	 * @return the idDocument
	 */
	public Long getIdDocument() {
		return idDocument;
	}

	/**
	 * @param idDocument the idDocument to set
	 */
	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}

	/**
	 * @return the pathDoucument
	 */
	public String getPathDoucument() {
		return pathDoucument;
	}

	/**
	 * @param pathDoucument the pathDoucument to set
	 */
	public void setPathDoucument(String pathDoucument) {
		this.pathDoucument = pathDoucument;
	}

	/**
	 * @return the isCheack
	 */
	public boolean getIsCheck() {
		return isCheck;
	}

	/**
	 * @param isCheack the isCheack to set
	 */
	public void setIsCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}

	/**
	 * @return the isEnableDocument
	 */
	public boolean getIsEnableDocument() {
		return isEnableDocument;
	}

	/**
	 * @param isEnableDocument the isEnableDocument to set
	 */
	public void setIsEnableDocument(boolean isEnableDocument) {
		this.isEnableDocument = isEnableDocument;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}