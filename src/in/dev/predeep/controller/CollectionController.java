package in.dev.predeep.controller;

import in.dev.predeep.impl.CollectionServiceImpl;
import in.dev.predeep.service.CollectionService;

public class CollectionController {

	private static final CollectionService SERVICE = new CollectionServiceImpl();

	public static void main(String[] args) {

		SERVICE.listExamplesOne();
	}
}
