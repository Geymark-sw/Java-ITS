package com.spring.ecommerce.service;

import com.spring.ecommerce.dto.ProdottoDTO;
import com.spring.ecommerce.dto.VenditoreDTO;

public interface VenditoreService {
	
	public boolean inserisciVenditore(VenditoreDTO vdto);
	public VenditoreDTO cercaPerIdVenditore(int id_venditore);
	public VenditoreDTO getDatiBaseVenditore(int id_venditore);
	public VenditoreDTO modificaPasswordVenditore(int id_venditore, String password);
	public boolean aggiungiProdotto(int id_venditore, ProdottoDTO pdto);
	public ProdottoDTO modificaQuantitaProdotto(int id_venditore, int id_prodotto, int quantita);

}
