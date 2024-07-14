CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS  student (
         id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
         first_name VARCHAR(255),
         last_name VARCHAR(255),
         other_name VARCHAR(255),
         gender VARCHAR(10),
         valid BOOLEAN,
         created_at TIMESTAMP WITH TIME ZONE,
         updated_at TIMESTAMP WITH TIME ZONE
);
