/*
 * Copyright 2015 the original author or authors.
 */
package com.rte.bob.collecting.model.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.rte.bob.collecting.model.Offre;

/**
 * @author zoheir Boutaleb
 */
public class OffreFieldSetMapper implements FieldSetMapper<Offre> {

	@Override
	public Offre mapFieldSet(FieldSet fieldSet) throws BindException {
		return new Offre(fieldSet.readLong("id"),
				fieldSet.readString("reference_offre"),
				fieldSet.readString("eda"),
				fieldSet.readDate("heure_debut", "yyyy-MM-dd HH:mm:ss"));
	}
}
