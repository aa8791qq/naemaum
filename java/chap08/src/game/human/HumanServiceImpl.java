package game.human;

public class HumanServiceImpl implements HumanService {

	@Override
	public HumanDTO getMember(HumanDTO humanDTO) {
		HumanDAO dao = new HumanDAOImpl(); // HumanDAO 생략
		humanDTO = dao.selectMember(humanDTO);
		
//		HumanDTO = dao.selectMember(humanDTO);
//		return dto2;
		
//		humanDTO = dao.selectMember(humanDTO);
//		return humanDTO;
		
		return humanDTO;
	}

}
