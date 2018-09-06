package br.com.alura.recomendador;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaProdutos {

	public static void main(String[] args) throws IOException, TasteException {
		// TODO Auto-generated method stub
		File file = new File("dados.csv");
		DataModel model = new FileDataModel(file);
		
		Recommender recommender = new RecomendadorProdutosBuilder().buildRecommender(model);
		
		List<RecommendedItem> recommendations = recommender.recommend(6, 3);
		for(RecommendedItem recommendation: recommendations) {
			System.out.println(recommendation);
		}
		
	}

}
