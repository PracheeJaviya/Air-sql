-- Table: public.flightdetails

-- DROP TABLE public.flightdetails;

CREATE TABLE public.flightdetails
(
    origin character varying COLLATE pg_catalog."default" NOT NULL,
    dest character varying COLLATE pg_catalog."default" NOT NULL,
    flightno character varying COLLATE pg_catalog."default" NOT NULL,
    freq character varying COLLATE pg_catalog."default" NOT NULL,
    dep character varying COLLATE pg_catalog."default" NOT NULL,
    arr character varying COLLATE pg_catalog."default" NOT NULL,
    aircraft character varying COLLATE pg_catalog."default" NOT NULL,
    stops bigint NOT NULL,
    index integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    CONSTRAINT flightdetails_pkey PRIMARY KEY (index),
    CONSTRAINT flighdetails_unique UNIQUE (index)
)

TABLESPACE pg_default;

ALTER TABLE public.flightdetails
    OWNER to postgres;
