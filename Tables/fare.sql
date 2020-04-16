-- Table: public.fare

-- DROP TABLE public.fare;

CREATE TABLE public.fare
(
    aircraft text COLLATE pg_catalog."default" NOT NULL,
    efare integer NOT NULL,
    bfare integer NOT NULL,
    CONSTRAINT fare_pkey PRIMARY KEY (aircraft),
    CONSTRAINT fare_unique UNIQUE (aircraft)
)

TABLESPACE pg_default;

ALTER TABLE public.fare
    OWNER to panth;