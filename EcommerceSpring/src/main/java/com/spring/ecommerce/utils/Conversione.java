package com.spring.ecommerce.utils;

import java.util.ArrayList;
import java.util.List;

import com.spring.ecommerce.dto.ProdottoDTO;
import com.spring.ecommerce.dto.VenditoreDTO;
import com.spring.ecommerce.entity.Prodotto;
import com.spring.ecommerce.entity.Venditore;

public class Conversione {

	public static Venditore daVenditoreDTOaVenditore(VenditoreDTO vdto) {
		Venditore v = new Venditore(vdto.getId_venditore(), vdto.getNome(), vdto.getCognome(), vdto.getUsername(), vdto.getPassword(), vdto.getVia(), vdto.getCitta());
		List<Prodotto> lista_p = new ArrayList<Prodotto>();
		
		for(ProdottoDTO pdto : vdto.getLista_prodotti()) {
			lista_p.add(Conversione.daProdottoDTOAProdotto(pdto));
		}
		v.setLista_prodotti(lista_p);
		return v;
	}
	
	public static VenditoreDTO daVenditoreaVenditoreDTO(Venditore v) {
		VenditoreDTO vdto = new VenditoreDTO(v.getId_venditore(), v.getNome(), v.getCognome(), v.getUsername(), v.getPassword(), v.getVia(), v.getCitta());
		List<ProdottoDTO> lista_pdto = new ArrayList<ProdottoDTO>();
		
		for(Prodotto p : v.getLista_prodotti()) {
			lista_pdto.add(Conversione.daProdottoAProdottoDTO(p));
		}
		vdto.setLista_prodotti(lista_pdto);
		return vdto;
	}

	public static ProdottoDTO daProdottoAProdottoDTO(Prodotto p) {
		
		return new ProdottoDTO(p.getId_prodotto(), p.getNome(), p.getDescrizione(), p.getCategoria(), p.getQuantita(), p.getPrezzo(), p.getSconto());
	}
	
	public static Prodotto daProdottoDTOAProdotto(ProdottoDTO pdto) {
		
		return new Prodotto(pdto.getId_prodotto(), pdto.getNome(), pdto.getDescrizione(), pdto.getCategoria(), pdto.getQuantita(), pdto.getPrezzo(), pdto.getSconto());
	}

}
