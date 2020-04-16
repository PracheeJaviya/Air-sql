-- Table: public.userdetails

-- DROP TABLE public.userdetails;

CREATE TABLE public.userdetails
(
    name character varying COLLATE pg_catalog."default" NOT NULL,
    addr character varying COLLATE pg_catalog."default" NOT NULL,
    city character varying COLLATE pg_catalog."default" NOT NULL,
    state character varying COLLATE pg_catalog."default" NOT NULL,
    country character varying COLLATE pg_catalog."default" NOT NULL,
    username character varying COLLATE pg_catalog."default" NOT NULL,
    passwd character varying COLLATE pg_catalog."default" NOT NULL,
    mobno character varying COLLATE pg_catalog."default" NOT NULL,
    email character varying COLLATE pg_catalog."default" NOT NULL,
    dob character varying COLLATE pg_catalog."default" NOT NULL,
    index integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    logon integer NOT NULL,
    CONSTRAINT userdetails_pkey PRIMARY KEY (username),
    CONSTRAINT userdetails_unique UNIQUE (username)
)

TABLESPACE pg_default;

ALTER TABLE public.userdetails
    OWNER to postgres;
