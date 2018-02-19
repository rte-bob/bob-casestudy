package com.rte.bob.collecting.service.processor;

import org.springframework.batch.item.ItemProcessor;

import com.rte.bob.collecting.model.Offre;


public class OffreItemProcessor implements ItemProcessor <Offre,Offre>{
public static int processed;
	@Override
	public Offre process(Offre item) throws Exception {
		
		OffreItemProcessor.incProcessed();
		System.out.println("Offre Processing n° "+processed+" : nom : "+item.getEda()+" "+item.getReference_offre());
		
		return item;
	}
	private static void incProcessed() {
		++processed;
	}

}
