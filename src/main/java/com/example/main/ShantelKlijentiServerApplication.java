package com.example.main;

import com.example.main.models.*;
import com.example.main.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShantelKlijentiServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShantelKlijentiServerApplication.class, args);
	}

	@Autowired
	ClientRepository clientRepository;
	@Autowired
	LinkRepository linkRepository;
	@Autowired
	LinkCheckRepository linkCheckRepository;
	@Autowired
	RequestRepository requestRepository;
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		ClientModel clientModel = new ClientModel(1L,"Ime Prezime","email@email","napomena", Timestamp.valueOf(LocalDateTime.now()));
		LinkModel linkModel = new LinkModel(1L,"url","nasUrl",45.23,Timestamp.valueOf(LocalDateTime.now()));
		LinkCheckModel linkCheckModel = new LinkCheckModel(1L,"url","status",Timestamp.valueOf(LocalDateTime.now()),"teme");
		RequestModel requestModel = new RequestModel(1L,"status","napomena",false,Timestamp.valueOf(LocalDateTime.now()));
		UserModel userModel = new UserModel(1L,"ADMIN","ime","prezime","user1",new BCryptPasswordEncoder().encode("pass1"),"tema");

		List<LinkModel> list = new ArrayList<>();
		list.add(linkModel);
		List<LinkCheckModel> list1 = new ArrayList<>();
		list1.add(linkCheckModel);
		List<RequestModel> list2 = new ArrayList<>();
		list2.add(requestModel);
		List<ClientModel> list3 = new ArrayList<>();
		list3.add(clientModel);

		UserModel u = userRepository.save(userModel);
		requestModel.setKorisnik(userRepository.getById(u.getId()));
		RequestModel r = requestRepository.save(requestModel);
		clientModel.setKorisnik(userRepository.getById(u.getId()));
		ClientModel c = clientRepository.save(clientModel);

		linkModel.setKlijent(clientRepository.getById(c.getId()));
		linkRepository.save(linkModel);
		linkRepository.save(linkModel);
		linkRepository.save(linkModel);
		linkCheckModel.setZahtev(requestRepository.getById(r.getId()));
		linkCheckRepository.save(linkCheckModel);
		linkCheckRepository.save(linkCheckModel);
		linkCheckRepository.save(linkCheckModel);

		List<LinkModel> linkovi = linkRepository.findAll();
		for(LinkModel l: linkovi){
			if(l.getKlijent().getId() == 17){
				System.out.println(l.getId());
			}
		}

	}
}
