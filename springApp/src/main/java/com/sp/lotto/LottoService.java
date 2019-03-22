package com.sp.lotto;

import java.util.List;
import java.util.Map;

public interface LottoService {
	public Map<String, List<Integer>> createLotto(Lotto dto);
}
