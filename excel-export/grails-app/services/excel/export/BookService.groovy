package excel.export

import com.itsherman.excel.export.Book
import grails.gorm.transactions.Transactional

@Transactional
class BookService {

    List<Book> findAll() {
        [
                new Book("1491950358", "Building Microservices"),
                new Book("1680502395", "Release It!"),
                new Book("0321601912", "Continuous Delivery")
        ]
    }
}
