package org.example;

import org.example.article.controller.ArticleController;
import org.example.system.SystemController;

import java.util.Scanner;

public class App {
    ArticleController articleController = new ArticleController();
    SystemController systemController = new SystemController();
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("⭐⭐⭐ 텍스트 게시판 ⭐⭐⭐");

        while (true) {
            System.out.print("명령 >> ");
            String command = sc.nextLine().trim();

            switch (command) {
                case "종료" :
                    systemController.exit();
                    return;
                case "등록" :
                    articleController.write();
                    break;
                case "목록" :
                    articleController.list();
                    break;
                case "삭제" :
                    articleController.remove();
                    break;
                case "수정" :
                    articleController.modify();
                    break;
            }
        }
    }
}