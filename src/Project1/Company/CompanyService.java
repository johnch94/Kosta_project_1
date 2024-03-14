package Project1.Company;

import java.util.Scanner;

public class CompanyService {
	CompanyDao dao;

	public CompanyService() {
		dao = new CompanyDao();
	}

	// 기업 등록
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
		Company p = new Company(0, 0, cname, field, id, tell, email, addr);
		int cnt = dao.insertCompany(p);
		if (cnt > 0) {
			System.out.println("기업 등록 완료");
		} else {
			System.out.println("기업 등록 실패");
		}

	}

	// 기업 수정 기업이름, 기업분야, 기업전화번호, 기업 이메일, 기업주소
	public void editCompany(Scanner sc) {
		System.out.println("===기업 수정===");
		System.out.print("수정할 기업이름:");
		String cname = sc.next();
		System.out.print("수정할 기업분야:");
		String field = sc.next();
		System.out.print("수정할 기업전화번호:");
		String tell = sc.next();
		System.out.print("수정할 기업이메일:");
		String email = sc.next();
		System.out.print("수정할 기업주소:");
		String addr = sc.next();
		Company p = new Company(0, 0, cname, field, "null", tell, email, addr);
		int cnum = p.getCnum();
		int cnt = dao.updateCompany(p, cnum);
		if (cnt > 0) {
			System.out.println("기업 수정 완료");
		} else {
			System.out.println("기업 수정 실패");
		}
	}

	// 기업 삭제
	public void deleteCompany(Scanner sc) {
		System.out.println("===기업 삭제===");
		System.out.print("삭제할 기업번호:");
		int cnum = sc.nextInt();
		int cnt = dao.deleteCompany(cnum);
		if (cnt > 0) {
			System.out.println("기업 삭제 완료");
		} else {
			System.out.println("기업 삭제 실패");
		}
	}
	
	// 기업 정보 조회 (분야)
	public void printCompany(Scanner sc){
		System.out.println("===기엄 정보 조회===");
		System.out.print("찾을 ");
		
	}
	// 기업 정보 전체조회

}
