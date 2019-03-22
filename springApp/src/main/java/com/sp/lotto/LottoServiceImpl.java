package com.sp.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("lotto.lottoService")
public class LottoServiceImpl implements LottoService{
	@Override
	public Map<String, List<Integer>> createLotto(Lotto dto) {
		
		Map<String ,List<Integer>> map=new HashMap<>();
	
		for(int i=0; i<dto.getNum();i++) {
			String key="lotto_"+i;
			List<Integer> list= new ArrayList<>();
			for(int j=0; j<6; j++) {
				int num=(int)(Math.random()*45)+1;
				if(list==null || list!= null && !list.contains(num)) {
					list.add(num);
				} else {
					j--;
					continue;
				}
			}
			Collections.sort(list);
			map.put(key, list);			
		}
		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			for(Integer a: map.get(key)) {
				System.out.println(a+" ");
			}
		}

		return map;
	}

}
