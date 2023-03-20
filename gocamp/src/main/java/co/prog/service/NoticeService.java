package co.prog.service;

import java.util.List;

import co.prog.vo.NoticeVO;

public interface NoticeService {
	public List<NoticeVO> noticeList();
	public List<NoticeVO> noticeListPage(int page);//목록
	public boolean addNotice (NoticeVO vo);//등록
	public NoticeVO getNotice (String boId);//단건조회
	public int getTotalCount(); //전체건수
//	public boolean noticeModify(NoticeVO vo);//수정
//	public boolean noticeRemove(int nid);//삭제
	public List<NoticeVO> boardList();//게시판list
	
	
}
