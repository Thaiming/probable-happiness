package hk.lab5.rd.model;

import java.util.List;

import hk.lab5.rd.dtos.NoticeDto;


public interface IDao {

	public List<NoticeDto> noticeList();
}
