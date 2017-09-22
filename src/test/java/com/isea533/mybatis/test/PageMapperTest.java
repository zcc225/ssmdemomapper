/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.isea533.mybatis.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zccpro.mapper.CountryMapper;
import com.zccpro.mapper.TAccountsLogsMapper;
import com.zccpro.model.Country;
import com.zccpro.model.TAccountsLogs;
import com.zccpro.service.TAccountsLogsServer;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by liuzh on 2015/3/7.
 */
public class PageMapperTest extends BasicTest {

//    @Autowired
//    private CountryMapper countryMapper;

//    @Autowired
//    private SqlSession sqlSession;

//	@Autowired
//	private TAccountsLogsMapper tAccountsLogsMapper;
//	
	@Autowired
	private TAccountsLogsServer tAccountsLogsServer;
	
    @Test
    public void test(){
//        CountryMapper countryMapper = sqlSession.getMapper(CountryMapper.class);
//        Example example = new Example(Country.class);
//        example.createCriteria().andGreaterThan("id",100);
//        PageHelper.startPage(2,10);
//        List<Country> countries = countryMapper.selectByExample(example);
//        PageInfo<Country> pageInfo = new PageInfo<Country>(countries);
//        System.out.println(pageInfo.getTotal());
//
//        countries = countryMapper.selectByExample(example);
//        pageInfo = new PageInfo<Country>(countries);
//        System.out.println(pageInfo.getTotal());
    	
//    	Country country = new Country();
//    	country.setId(100);
//    	PageHelper.startPage(3,10);
//    	List<Country> select = countryMapper.selectAll();
//    	for (Country country2 : select) {
//			System.out.println(country2.getCountrycode());
//		}
    	
//    	TAccountsLogs tAccountsLogs = new TAccountsLogs();
//    	tAccountsLogs.setId(1);
//    	List<TAccountsLogs> select = tAccountsLogsMapper.select(tAccountsLogs);
//    	PageHelper.startPage(1, 2);
//    	List<TAccountsLogs> selectAll = tAccountsLogsMapper.selectAll();
//    	for (TAccountsLogs tAccountsLogs2 : selectAll) {
//    		System.out.println(tAccountsLogs2.getExt1());
//    		
//    	}
    	Example example = new Example(TAccountsLogs.class);
//    	tAccountsLogs.createCriteria().ad
//    	example.createCriteria().andBetween("id", 0, 4);
    	List<TAccountsLogs> selectByExample = tAccountsLogsServer.selectByExample(example);
    	for (TAccountsLogs tAccountsLogs : selectByExample) {
    		System.out.println(tAccountsLogs.getId());
		}
    	
    }
}
