package sample;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        //HushMapにキーと値を追加
        members.put("GK","前川" );
        members.put("DF","菅原" );
        members.put("MF","守田" );
        members.put("FW","上田" );
        
        //要素の取得
        String fw = members.get("FW");
        System.out.println("FWは" + fw);
        
        System.out.println("");
        
        //要素の変更
        members.put("FW", "細谷");//要素を置換
        System.out.println("1番目の要素(置換後) : " + members.get("FW"));
        
        System.out.println("");
        
        //要素の削除
        System.out.println("GKの要素(削除前) : " + members.get("GK"));
        members.remove("GK");
        System.out.println("GKの要素(削除後) : " + members.get("GK"));
        
        System.out.println("");
        
        //拡張forループ式による取得:entryset
        for(Map.Entry<String, String> entry : members.entrySet()) {
            System.out.println("keySet キー: " + entry.getKey() + ", 値:" + entry.getValue());
            
        }
        
        System.out.println("");
        
        //拡張forループによる取得:keySet
        for(String key : members.keySet()) {
            System.out.println("keySet キー: " + key + ", 値: " + members.get(key));
        }
        
        System.out.println("");
        
        //拡張forループ式による取得:values
        for(String value : members.values()) {
            System.out.println("values 値: " + value);
        }
        
        System.out.println("");
        
        //サイズの取得
        int size = members.size();
        System.out.println("Mapのサイズ(クリア前)" + size);
        members.clear();
        System.out.println("Mapのサイズ(クリア後)" + members.size());

    }

}
