package hk.lab5.rd.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hk.lab5.rd.dtos.NoticeDto;
import hk.lab5.rd.dtos.PageDto;

@Service
public class ServiceImpl implements IService {

	@Autowired
	private IDao idao;
	
	@Override
	public List<NoticeDto> noticeList() {
		return idao.noticeList();
	}

}
