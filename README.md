Microservice Rombongan Belajar

List of end point :

1. findAll 
	a.	url    : "/tahunajaran",
		method : GET,
		return : semua data tahun ajaran yang ada di database.
	
		
	b.  url    : "/semester",
		method : GET,
		return : semua data semester yang ada di database.
	
	
	c.  url    : "/programstudi",
		method : GET,
		return : semua data program studi yang ada di database.
	
	
	d.  url    : "/kelas",
		method : GET,
		return : semua data kelas yang ada di database.
		
2. findById

	a.  url		: "/tahunajaran/{id}",
		method	: GET,
		return	: data tahunajaran dengan kode_tahun_ajaran sesuai dengan parameter.

	b.  url		: "/semester/{id}",
		method	: GET,
		return	: data semester dengan kode_semester sesuai dengan parameter.

	c.  url		: "/programstudi/{id}",
		method	: GET,
		return	: data program studi dengan kode_program_studi sesuai dengan parameter.

	d.  url		: "/kelas/{id}",
		method	: GET,
		return	: data program kelas dengan kode_kelas sesuai dengan parameter.

