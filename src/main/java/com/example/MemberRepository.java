package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
	
	private static final RowMapper<MemberDomein>MEMBER_ROW_MAPPER = (rs,i)->{
		MemberDomein member = new MemberDomein();
		member.setId(rs.getInt("id"));
		member.setName(rs.getString("name"));
		member.setAge(rs.getInt("age"));
		return member;
	};
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public List <MemberDomein>findAll(){
		String sql = "SELECT id,name,age FROM member ORDER BY id" ;
		List<MemberDomein> memberList = template.query(sql,MEMBER_ROW_MAPPER);
		return memberList;
	}

}
