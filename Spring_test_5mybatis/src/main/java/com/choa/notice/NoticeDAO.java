package com.choa.notice;

import java.util.List;

public interface NoticeDAO {
	//글보기
		public NoticeDTO noticeView(int num) throws Exception;	
		
		//리스트
		public List<NoticeDTO> listAll(int startNum, int lastNum) throws Exception;	
		
		//글쓰기
		public void noticeWrite(NoticeDTO noticeDTO) throws Exception;
		
		public int getCount() throws Exception;
}
