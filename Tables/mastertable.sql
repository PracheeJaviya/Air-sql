-- Table: public.reservation

-- DROP TABLE public.reservation;

CREATE TABLE public.reservation
(
    bcode character varying COLLATE pg_catalog."default" NOT NULL,
    username character varying COLLATE pg_catalog."default" NOT NULL,
    name character varying COLLATE pg_catalog."default" NOT NULL,
    age integer NOT NULL,
    gender character varying COLLATE pg_catalog."default" NOT NULL,
    seatno character varying COLLATE pg_catalog."default" NOT NULL,
    origin character varying COLLATE pg_catalog."default" NOT NULL,
    dest character varying COLLATE pg_catalog."default" NOT NULL,
    flightno character varying COLLATE pg_catalog."default" NOT NULL,
    date character varying COLLATE pg_catalog."default" NOT NULL,
    dep character varying COLLATE pg_catalog."default" NOT NULL,
    arr character varying COLLATE pg_catalog."default" NOT NULL,
    aircraft character varying COLLATE pg_catalog."default" NOT NULL,
    ebclass character varying COLLATE pg_catalog."default" NOT NULL,
    index integer NOT NULL,
    fare bigint NOT NULL,
    CONSTRAINT reservation_pkey PRIMARY KEY (bcode),
    CONSTRAINT reservation_fkey1 FOREIGN KEY (username)
        REFERENCES public.userdetails (username) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT reservation_fkey2 FOREIGN KEY (index)
        REFERENCES public.flightdetails (index) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT reservation_fkey3 FOREIGN KEY (aircraft)
        REFERENCES public.fare (aircraft) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.reservation
    OWNER to panth;