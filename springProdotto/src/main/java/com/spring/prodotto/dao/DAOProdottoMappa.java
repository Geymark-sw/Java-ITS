package com.spring.prodotto.dao;

import java.util.*;

import com.spring.prodotto.entity.Prodotto;

public class DAOProdottoMappa {
	
	private Map<Integer, Prodotto> mappa = new HashMap<Integer, Prodotto>();
	
	public boolean insert(Prodotto prodotto) {
		if(mappa.containsKey(prodotto.getId())){
			return false;
		}
		mappa.put(prodotto.getId(), prodotto);
		return true;
	}
	
	public List<Prodotto> selectAll(){
		return new ArrayList<Prodotto>(mappa.values());
	}
	
	public Prodotto selectById(int id) {
		if(mappa.containsKey(id))
			return mappa.get(id);
		return null;
	}
	
	public boolean delete(int id) {
		
		if(mappa.containsKey(id)) {
			mappa.remove(id);
			return true;
		}else {
			return false;
		}
		}
	}
	

