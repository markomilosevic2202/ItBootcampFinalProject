package Tests;

public class AdminCitiesTests extends BasicTest{
}
//Test #1: Visits the admin cities page and list cities
//Podaci:
//admin email: admin@admin.com
//admin password: 12345
//Koraci:
//Klik na sign up dugme iz navigacije
//Prijaviti se na sistem admin kredencijalima
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//Verifikovati da se u url-u stranice javlja /admin/cities ruta
//
//
//
//
//
//
//
//Test #2: Checks input types for create/edit new city
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//Kliknuti na New Item dugme
//Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//Verifikovati da polje za unos grada za atribut type ima tekst text
//
//
//
//
//Test #3: Create new city
//Podaci:
//city: [Ime i prezime polaznika]’s city
//Koraci:
//
//
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//Kliknuti na New Item dugme
//Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//Uneti ime grada u polje
//Kliknuti na Save dugme
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da poruka sadrzi tekst Saved successfully
//
//
//Test #4: Edit city
//Podaci:
//old city name: [Ime i prezime polaznika]’s city
//new city name: [Ime i prezime polaznika]’s city Edited
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//U polje za pretragu uneti staro ime grada
//Sacekati da broj redova u tabeli bude 1
//Kliknuti na dugme Edit iz prvog reda
//Uneti novo ime za grad
//Kliknuti na dugme Save
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da poruka sadrzi tekst Saved successfully
//
//
//
//
//
//
//
//
//Test #5: Search city
//Podaci:
//city name: [Ime i prezime polaznika]’s city Edited
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//U polje za pretragu uneti staro ime grada
//Sacekati da broj redova u tabeli bude 1
//Verifikovati da se u Name koloni prvog reda nalazi tekst iz pretrage
//
//
//Test #5: Delete city
//Podaci:
//city name: [Ime i prezime polaznika]’s city Edited
//Koraci:
//Klik na admin dugme iz navigacije
//Klik na Cities dugme iz padajuceg Admin menija
//U polje za pretragu uneti staro ime grada
//Sacekati da broj redova u tabeli bude 1
//Verifikovati da se u Name koloni prvog reda nalazi tekst iz pretrage
//Kliknuti na dugme Delete iz prvog reda
//Sacekati da se dijalog za brisanje pojavi
//Kliknuti na dugme Delete iz dijaloga
//Sacekati da popu za prikaz poruke bude vidljiv
//Verifikovati da poruka sadrzi tekst Deleted successfully