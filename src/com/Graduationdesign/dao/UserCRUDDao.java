package com.Graduationdesign.dao;

import java.sql.Connection;
import java.util.List;

import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;

public interface UserCRUDDao<T, E> {
     T search(T t,Connection con);
     T delete(T t,Connection con);
     T change(T t,Connection con);
     T add(T t,Connection con);
     //��ѯȫ������״̬������Ŀ
     List<E> search_all(Integer integer,Connection con);
     //��ʦ�������
     Integer add_dissertation(Dissertation dissertation,Connection con);
     //�޸����� 
     Integer update_dissertation(Dissertation dissertation,Connection connection,int type);
     //ѧ��ѡ��
     Integer select_dissertation(Student student,Connection con);
     
     //�����ѯ��ѧ����
     Integer update_dissertation_bystudent(Student student,Connection con);
     //��ѯÿ��ѧ����ѡ�����
     List<Dissertation> Inquire_allstudent(Connection con);
     //��ѯ����ѧ����ѡ�����  ����    ������ʦ�ĳ������
     Dissertation inDissertation_onestudent(Connection con,T t);
     //��ѯ�����û���Ϣ
     List<E> searchAllUser(Connection con,int type);
 
}