package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberLee = new Member(102, "ÀÌ¼ø½Å ");
		Member memberKim = new Member(101, "±èÀ¯½Å ");
		Member memberShin = new Member(103, "½Å»çÀÓ´ç ");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
	
		memberHashSet.showAll();
	
		Member memberLee2 = new Member(101, "ÀÌ¸ù·æ ");
		memberHashSet.addMember(memberLee2);
//		memberHashSet.showAll();
	}

}
