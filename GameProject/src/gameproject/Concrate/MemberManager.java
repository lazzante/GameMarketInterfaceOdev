package gameproject.Concrate;

import gameproject.Abstract.MemberCheckService;
import gameproject.Abstract.MemberService;
import gameproject.Entities.Member;

public class MemberManager implements MemberService{
private MemberCheckService memberCheckService;



	public MemberManager(MemberCheckService memberCheckService) {
	this.memberCheckService = memberCheckService;
}

	@Override
	public void memberRegister(Member member) {
		if(memberCheckService.checkIfRealPerson(member)) {
		System.out.println("Member Registered : "+member.getFirstName());
		}
		else {
		System.out.println("Invaild Person !");	
		}
	}

	@Override
	public void memberUpdate(Member member) {
		System.out.println("Member Updated : "+member.getFirstName());
		
	}

	@Override
	public void memberDelete(Member member) {
		System.out.println("Üye silindi : "+member.getFirstName());
		
	}

}
