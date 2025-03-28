package com.spring.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.ecommerce.dao.EcommerceDAO;
import com.spring.ecommerce.dto.ProdottoDTO;
import com.spring.ecommerce.dto.VenditoreDTO;
import com.spring.ecommerce.entity.Prodotto;
import com.spring.ecommerce.entity.Venditore;
import com.spring.ecommerce.utils.Conversione;

@Service
@Transactional
public class VenditoreServiceImpl implements VenditoreService {
	
	@Autowired
	EcommerceDAO dao;
	
	
	@Override
	public boolean inserisciVenditore(VenditoreDTO vdto) {
		if(this.dao.findById(vdto.getId_venditore()).isEmpty()) {
			this.dao.save(Conversione.daVenditoreDTOaVenditore(vdto));
			return true;
		}
		throw new RuntimeException("Id gia' presente");
			
	}

	@Override
	public VenditoreDTO cercaPerIdVenditore(int id_venditore) {
		if(this.dao.cercaPerIdVenditore(id_venditore) != null) {
			return Conversione.daVenditoreaVenditoreDTO(this.dao.cercaPerIdVenditore(id_venditore));
		}
		throw new RuntimeException("Id non presente");
	}

	@Override
	public VenditoreDTO getDatiBaseVenditore(int id_venditore) {
		if(this.dao.cercaPerIdVenditore(id_venditore) == null)
			throw new RuntimeException("ID non presente");
		Venditore v = this.dao.cercaPerIdVenditore(id_venditore);
		//Non richiamo la funzione di conversione perchè altrimenti mi andrebbe a istanziare l'oggetto con la lista
		//Facendo in questo modo costruisco l'oggetto senza lista e soddisfo la richiesta della funzione
		return new VenditoreDTO(v.getId_venditore(), v.getNome(), v.getCognome(), v.getUsername(), v.getPassword(), v.getVia(), v.getCitta());
	}

	@Override
	public VenditoreDTO modificaPasswordVenditore(int id_venditore, String password) {
		if(this.dao.findById(id_venditore).isPresent()) {
			this.dao.findById(id_venditore).get().setPassword(password);
			return Conversione.daVenditoreaVenditoreDTO(this.dao.findById(id_venditore).get());
		}
		throw new RuntimeException("Id non presente");
	}

	@Override
	public boolean aggiungiProdotto(int id_venditore, ProdottoDTO pdto) {
		if(this.dao.findById(id_venditore).isPresent()) {
			this.dao.findById(id_venditore).get().getLista_prodotti().add(Conversione.daProdottoDTOAProdotto(pdto));
			return true;
		}
		throw new RuntimeException("Id non presente");
	}

	@Override
	public ProdottoDTO modificaQuantitaProdotto(int id_venditore, int id_prodotto, int quantita) {
		if(this.dao.findById(id_venditore).isPresent()) {
			for(Prodotto p : this.dao.findById(id_venditore).get().getLista_prodotti()) {
				if(p.getId_prodotto() == id_prodotto) {
					p.setQuantita(quantita);
					return Conversione.daProdottoAProdottoDTO(p);
				}
			}
		}
		throw new RuntimeException("Id non presente");
	}

}
