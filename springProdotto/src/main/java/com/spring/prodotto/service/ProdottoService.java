package com.spring.prodotto.service;

import java.util.*;

import com.spring.prodotto.dao.DAOProdottoMappa;
import com.spring.prodotto.dto.ProdottoDTO;
import com.spring.prodotto.dto.ProdottoNoIdDTO;
import com.spring.prodotto.entity.Prodotto;
import com.spring.prodotto.utility.Conversione;

public class ProdottoService {
	
	private DAOProdottoMappa dao = new DAOProdottoMappa();
	
	public boolean insert(ProdottoDTO dto) {
		return this.dao.insert(Conversione.daProdottoDTOaProdotto(dto));
	}
	
	public List<ProdottoNoIdDTO> selectAll(){
		List<Prodotto> listaProdotti = this.dao.selectAll();
		List<ProdottoNoIdDTO> listaProdottiNoIdDTO = new ArrayList<ProdottoNoIdDTO>();
		
		for(Prodotto pid : listaProdotti) {
			listaProdottiNoIdDTO.add(Conversione.daProttoAProdottNoIdDTO(pid));
		}
		
		return listaProdottiNoIdDTO;
	}
	
	public ProdottoDTO selectById(int id) {
		return Conversione.daProdottoaProdottoDTO(this.dao.selectById(id));
	}

}
