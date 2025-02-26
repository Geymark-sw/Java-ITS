package com.spring.prodotto.utility;

import com.spring.prodotto.dto.ProdottoDTO;
import com.spring.prodotto.dto.ProdottoNoIdDTO;
import com.spring.prodotto.entity.Prodotto;

public class Conversione {
	
	public static Prodotto daProdottoDTOaProdotto(ProdottoDTO dto) {
		return new Prodotto(dto.getId(), dto.getMarca(), dto.getModello(), dto.getDescrizione(), dto.getCategoria(), dto.getPrezzoConsigliato(), dto.getPrezzoMassimo(), dto.getQuantità());
	}
	
	public static ProdottoDTO daProdottoaProdottoDTO(Prodotto prodotto) {
		return new ProdottoDTO(prodotto.getId(), prodotto.getMarca(), prodotto.getModello(), prodotto.getDescrizione(), prodotto.getCategoria(), prodotto.getPrezzoConsigliato(), prodotto.getPrezzoMassimo(), prodotto.getQuantità());
	}
	
	public static ProdottoNoIdDTO daProttoAProdottNoIdDTO(Prodotto prodotto) {
		return new ProdottoNoIdDTO(prodotto.getMarca(), prodotto.getModello(), prodotto.getDescrizione(), prodotto.getCategoria(), prodotto.getPrezzoConsigliato(), prodotto.getPrezzoMassimo(), prodotto.getQuantità());
	}

}
