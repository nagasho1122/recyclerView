package com.nagase.nagasho.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData:List<CourseData> = listOf(
        CourseData(R.drawable.android,"Androidアプリプログラミングコース","色んなアプリを作って、プログラミングを楽しもう！"),
        CourseData(R.drawable.iphone,"iphoneアプリプログラミングコース","世界に1つだけのiphoneアプリをつくって、周りを驚かせよう！"),
        CourseData(R.drawable.unity,"unityゲームプログラミングコース","世界を驚かすワクワクが止まらない！ 3Dゲームを作成しよう！"),
        CourseData(R.drawable.minecraft,"minecraftプログラミングコース","マインクラフトでjavaプログラミングを学ぼう！"),
        CourseData(R.drawable.movie,"アニメーションコース","頭の中で描いたストーリーをアニメにしてみよう！"),
        CourseData(R.drawable.animation,"映像制作コース","君の想像を3Dで実現しよう！"),
        CourseData(R.drawable.maya,"Maya 3DCGコース","撮影から編集まで。オリジナルの映像作品を作りだそう！"),
        CourseData(R.drawable.camera,"カメラ＆フォトグラフィーコース","みんなに一目置かれる写真作品を作れるようになろう！"),
        CourseData(R.drawable.media_art,"メディアアートプログラミングコース","映像とプログラミングの融合！メディアアートの世界へ！"),
        CourseData(R.drawable.designer,"デザイナーコース","思い描いたイメージを形にできる、一生使える力を身につけよう！"),
        CourseData(R.drawable.web_design,"Webデザインコース","HTML5、CSS3、JavaScriptで動くオリジナルWebサービスをリリースしよう！"),
        CourseData(R.drawable.web_service,"Webサービスプログラミングコース","インターネットの仕組みを学び、Webサービスをリリースしよう！"),
        CourseData(R.drawable.digital_music,"デジタルミュージックコース","今日から君はミュージシャン！その直感を音楽に変えよう！"),
        CourseData(R.drawable.miku,"初音ミク V3コース","初音ミクにメロディを歌わせよう！")

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = adapter

        adapter.addAll(courseData)
    }
}