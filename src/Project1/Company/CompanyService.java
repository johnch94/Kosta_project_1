package Project1.Company;

import java.util.Scanner;

public class CompanyService {
	CompanyDao dao;

	public CompanyService() {
		dao = new CompanyDao();
	}
	
	//기업 등록
	public void addCompany(Scanner sc) {
		System.out.println("===기업등록===");
		System.out.print("기업 이름:");
		String cname = sc.next();
		System.out.print("기업 분야:");
		String field = sc.next();
		System.out.print("사업자 번호:");
		String id = sc.next();
		System.out.print("기업 전화번호:");
		String tell = sc.next();
		System.out.print("기업 이메일:");
		String email = sc.next();
		System.out.print("기업 주소:");
		String addr = sc.next();
		
		
	}
	//기업 수정
	//기업 삭제
	//기업 정보 조회 (분야)
	//기업 정보 전체조회

}
