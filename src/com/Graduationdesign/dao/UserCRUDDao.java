package com.Graduationdesign.dao;

import java.security.Permission;
import java.sql.Connection;
import java.util.List;

import javax.swing.text.StyledDocument;

import com.Graduationdesign.entity.Academy;
import com.Graduationdesign.entity.AcademyManager;
import com.Graduationdesign.entity.Class;
import com.Graduationdesign.entity.Dissertation;
import com.Graduationdesign.entity.Manager;
import com.Graduationdesign.entity.Profession;
import com.Graduationdesign.entity.Student;
import com.Graduationdesign.entity.Teacher;

public interface UserCRUDDao<T, E> {
     T search(T t,Connection con);
     T delete(T t,Connection con);
     T change(T t,Connection con);
     //��Ӹ����û���Ϣ
     Integer add(T t,Connection con);
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
     List<E> searchAllUser(Connection con,int type,int page);
     //��ѯ�����������
     int searchAllnum(Connection con,int type);
     //����ѧ��������ѯѧ����Ϣ
     List<Student> searchByStudentName(Connection con,Student student,int type);
     //���ѧԺ
     int addAcademy(Academy academy,Connection con);
     //���רҵ
     int  addProfession(Profession profession,Connection con);
     //��Ӱ༶
     int addClass(Class class1,Connection con);
     //��ѯ��ӦѧԺ��רҵ
     Profession searchPBA();
     //��ѯ��Ӧרҵ�İ༶
     Class searchCBP();
     //��ѯ����ѧԺ
     List<Academy> searchAllAcademy(Connection con);
     //��ѯ����רҵ
     List<Profession> searchAllProfession(Connection con);
     //��ѯĳ��ѧԺ��Ӧ��רҵ
     List<Profession> searchAllProfessionbyAcademy(Connection con,Academy academy);
     //��ѯ���а༶
     List<Class> searchAllclass(Connection con);
     //��ѯĳ��רҵ��Ӧ�İ༶
     List<Class>   searchclassbyProfession(Connection con,Profession profession);
     //��ѯ����ĳ��ѧԺ�ĵ�����ѧ��
     List<Student>  searchAllStuFAcademy(Connection con,Academy academy);
     //��ѯ����ĳ��רҵ������ѧ��
     List<Student> searchAllStuFProfession(Connection con,Profession profession);
     //��ѯ����ĳ���༶������ѧ��
     List<Student> searchAllStuFClass(Connection con,Class class1);
     //��������ɾ��ĳ������Ա�û�
     Integer deleteManagerbyType(Connection con,int type,Manager manager);
     //��������ɾ��ĳ��ѧԺ����Ա�û�
     Integer deleteAmanagerbyType(Connection con,int type,AcademyManager aManager);
     //��������ɾ��ĳ����ʦ�û�
     Integer deleteTeacherbyType(Connection con,int type,Teacher teacher);
     //��������ɾ��ĳ��ѧ���û�
     Integer deleteStudentbyType(Connection con,int type,Student student);
     //ѧ���޸ĸ�����Ϣ
     Integer updateStudentInfo(Connection con,Student student);
     //��ʦ�޸ĸ�����Ϣ
     Integer updateTeacherInfo(Connection con,Teacher teacher);
     //����Ա�޸ĸ�����Ϣ
     Integer updateManagerInfo(Connection con,Manager manager);
     //ѧԺ����Ա�޸ĸ�����Ϣ
     Integer updateAmanagerInfo(Connection con,AcademyManager amanager);
    
     //��ѯĳרҵ����������
     List<Dissertation> searchAllDissertationByAcademy(Connection con,int pages,int id);
     //��ѯĳרҵ������������Ŀ
     int searchAllDissertationNumByAcademy(Connection con,int id);
     //����id ɾ��dissertation
     int deleteDissertationByid(int id,Connection con);
     //��ѯ��ͨ�������Ŀ
     List<Dissertation> searchYesDissbyAcademy_id(int id,Connection con,int status);
     //����id��ѯ��Ŀ��Ϣ
     Dissertation searchDissByid(int id,Connection con);
     //���ͨ��
     int EvaYes(int id,Connection con);
     //��˲���
     int EvaNo(int id,Connection con);
     //����ѧԺid���Ҹ���ѧԺ����ʦ
     List<Teacher> searchTeacherByAcademyId(int id,Connection con);
     //������ʦidɾ����ʦ
     int deleteTeacherByTeacherId(int teacherId,Connection con);
     //ѧԺ�����ʦ
     int addTeacherByAcademyId(int AcademyId,Connection con,Teacher iteacher);
     //ѧԺ���רҵ
     int addProfesionByAcademy(int AcademyId,Connection con,Profession iProfession);
     //רҵ��Ӱ༶
     int addClassByProfession(int profeId,Connection con,Class isClass);
     //���ݰ༶���ѧ��
     int addStudentbyClass(int ClassId,Connection con,Student isStudent);
     //����ѧԺ�������е�רҵ
     List<Profession> searchProfessionByAcademy(int Academyid,Connection con);
     //����רҵ�������а༶
     List<Class>   searchClassByProfession(int ProfessID,Connection con);
     //���ݰ༶��������ѧ��
     List<Student> searchStudentByClass(int ClassId,Connection con);
     
     
    
     
 
}