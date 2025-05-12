--import.sql
-- Inserindo categorias
INSERT INTO tb_category (id, name) VALUES (1, 'roupa');
INSERT INTO tb_category (id, name) VALUES (2, 'calcado');
INSERT INTO tb_category (id, name) VALUES (3, 'acessorio');

-- Inserindo produtos
INSERT INTO tb_product (name, price, description, image, category_id, sizes, colors) VALUES('Jaqueta Punk de Couro', 350.00, 'Jaqueta de couro sintético com spikes e tachinhas para um visual punk autêntico.', './src/img/products/jaqueta_punk.jpg', 1, 'P,M,G,GG', 'Preto');
INSERT INTO tb_product (name, price, description, image, category_id, sizes, colors) VALUES('Camiseta Gótica Caveira', 120.00, 'Camiseta de algodão com estampa detalhada de caveira e detalhes rasgados.', './src/img/products/camiseta_caveira.webp', 1, 'P,M,G,GG,XG', 'Preto,Vermelho');
INSERT INTO tb_product (name, price, description, image, category_id, sizes, colors) VALUES('Saia Xadrez Grunge', 180.00, 'Saia curta xadrez em estilo grunge, perfeita para compor um visual alternativo.', './src/img/products/saia_xadrez.jpg', 1, 'PP,P,M,G', 'Vermelho e Preto,Azul e Preto');
INSERT INTO tb_product (name, price, description, image, category_id, sizes, colors) VALUES('Bota Coturno Emo', 400.00, 'Coturno de couro legítimo com cadarço longo e solado tratorado.', './src/img/products/coturno_emo.jpg', 2, '34,35,36,37,38,39,40,41,42', 'Preto,Bordô');
INSERT INTO tb_product (name, price, description, image, category_id, sizes, colors) VALUES('Moletom Oversized Dark', 250.00, 'Moletom oversized com capuz e estampa dark, ideal para os dias frios.', './src/img/products/moletom_dark.webp', 1, 'M,G,GG,XG', 'Preto,Cinza');
INSERT INTO tb_product (name, price, description, image, category_id, sizes, colors) VALUES('Cinto de Rebites Gótico', 90.00, 'Cinto de couro sintético com rebites metálicos, ideal para compor um visual gótico.', './src/img/products/cinto_rebites.jfif', 3, 'Único', 'Preto,Prata');
INSERT INTO tb_product (name, price, description, image, category_id, sizes, colors) VALUES('Cinto de TESTE', 90.00, 'Cinto de couro sintético com rebites metálicos, ideal para compor um visual gótico.', './src/img/products/cinto_rebites.jfif', 3, 'Único', 'Preto,Prata');

-- Inserindo usuarios
INSERT INTO tb_user(display_name, username, password) VALUES ('Administrador', 'admin','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');
INSERT INTO tb_user(display_name, username, password) VALUES ('Teste', 'test','$2a$10$.PVIfB07x.SfMYTcToxL0.yxcLWU0GbS2NUO1W1QAvqMm/TsFhVem');