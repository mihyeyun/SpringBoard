package com.cloud.repository;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
	private int bno;         //�۹�ȣ
	private String title;    //����
	private String writer;   //�ۼ���
	private String content;  //����
	private Date regDate;    //�ۼ���
	private int cnt;         //��ȸ��
	
}
