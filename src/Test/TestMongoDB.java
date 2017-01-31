package Test;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class TestMongoDB {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 连接mongoDB
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		// 获取数据库
		MongoDatabase db = mongoClient.getDatabase("test");
		// 获取数据库中的集合
		MongoCollection users = db.getCollection("test1");
		// 查询结果
		FindIterable f = users.find();
		MongoCursor cur = f.iterator();
		// 取出结果
		while (cur.hasNext()) {
			Document doc = (Document) cur.next();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(doc.toJson());
			System.out.println(doc.get("_id"));
			doc.clear();
		}
		cur.close();
		mongoClient.close();
	}

}