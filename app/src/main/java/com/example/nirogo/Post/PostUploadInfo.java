package com.example.nirogo.Post;

public class PostUploadInfo {

String docImageurl, docName, docSpec, time, desc, posturl, numberDoc, docId, postDBid;
String likes;


    public PostUploadInfo() {
    }

    public PostUploadInfo(String docimage, String number, String docName, String docSpec, String time, String desc, String url, String likes, String docId, String postDBid) {
        this.docImageurl = docimage;
        this.numberDoc = number;
        this.docName = docName;
        this.docSpec = docSpec;
        this.time = time;
        this.desc = desc;
        this.posturl = url;
        this.likes = likes;
        this.docId= docId;
        this.postDBid=postDBid;
    }

    public String getNumberDoc() {
        return numberDoc;
    }

    public void setNumberDoc(String numberDoc) {
        this.numberDoc = numberDoc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDocImage() {
        return docImageurl;
    }

    public void setDocImage(String docImage) {
        this.docImageurl = docImage;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocSpec() {
        return docSpec;
    }

    public void setDocSpec(String docSpec) {
        this.docSpec = docSpec;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return posturl;
    }

    public void setUrl(String url) {
        this.posturl = url;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getPostDBid() {
        return postDBid;
    }

    public void setPostDBid(String postDBid) {
        this.postDBid = postDBid;
    }
}
