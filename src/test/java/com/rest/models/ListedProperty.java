package com.rest.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ListedProperty {
	private String title;
	private String description;
	private List<String> listing_images;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getListing_images() {
		return listing_images;
	}
	public void setListing_images(List<String> listing_images) {
		this.listing_images = listing_images;
	}
	
}
