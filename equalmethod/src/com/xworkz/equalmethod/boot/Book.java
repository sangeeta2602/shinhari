package com.xworkz.equalmethod.boot;

public class Book {   
	 public String brandName;
	 public int priceOfBook;
	 public int totalTypesBook;
	 public Boolean isItReuseful;
	 public int onlineBookPrice;
	 public String storyBookName;
	 public int noOfPages;
	 public int kingSizeBookPrice;
	 public int cutSizeBook;
	 public Boolean lowQualityOrHighQuality;
	 
	public Book(String brandName, int priceOfBook, int totalTypesBook, Boolean isItReuseful, int onlineBookPrice,
			String storyBookName, int noOfPages, int kingSizeBookPrice, int cutSizeBook,
			Boolean lowQualityOrHighQuality) {
	
		this.brandName = brandName;
		this.priceOfBook = priceOfBook;
		this.totalTypesBook = totalTypesBook;
		this.isItReuseful = isItReuseful;
		this.onlineBookPrice = onlineBookPrice;
		this.storyBookName = storyBookName;
		this.noOfPages = noOfPages;
		this.kingSizeBookPrice = kingSizeBookPrice;
		this.cutSizeBook = cutSizeBook;
		this.lowQualityOrHighQuality = lowQualityOrHighQuality;
	}
	 
	 

	public boolean equals(Object obj) {
		 if(this==obj) {
			 return true;
		 }
		 if(obj == null || getClass() !=obj.getClass()) {
			 return false;
		 }
		 Book book=(Book) obj;
		 
		 return brandName.equals(book.brandName) && priceOfBook==book.priceOfBook && totalTypesBook==book.totalTypesBook && isItReuseful.equals(book.isItReuseful) && onlineBookPrice==book.onlineBookPrice  && storyBookName.equals(book.storyBookName) && noOfPages==book.noOfPages && kingSizeBookPrice==book.kingSizeBookPrice && cutSizeBook==book.cutSizeBook
				&& lowQualityOrHighQuality.equals(book.lowQualityOrHighQuality);
	 }

}
