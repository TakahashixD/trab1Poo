package sistemaGestaoRecursos;

import java.util.ArrayList;
import java.util.Scanner;
import Humanos.Alunos;
import Humanos.Cozinheiros;
import Humanos.Instrutores;
import Humanos.Monitores;
import Humanos.Professores;
import Humanos.Serventes;
import Materiais.Materiais;
import Materiais.MaterialDidatico;
import Materiais.MaterialEscolar;
import Materiais.MaterialLimpeza;


public class Main {
	public static void main(String[] args) {
		//quantidade de cada recurso
		Scanner ler = new Scanner(System.in);
		int escolhaMenu = 0;
		int numHumanos = 0;
		int numAlunos = 0;
		int numCozinheiros = 0;
		int numInstrutores = 0;
		int numMonitores = 0;
		int numProfessores = 0;
		int numServentes = 0;
		int numMatD = 0;
		int numMatE = 0;
		int numMatL = 0;
		
		//ArrayLists dos recursos
		ArrayList<Alunos> listaAlunos = new ArrayList<Alunos>();
		ArrayList<Professores> listaProfessores = new ArrayList<Professores>();
		ArrayList<Instrutores> listaInstrutores = new ArrayList<Instrutores>();
		ArrayList<Monitores> listaMonitores = new ArrayList<Monitores>();
		ArrayList<Serventes> listaServentes = new ArrayList<Serventes>();
		ArrayList<Cozinheiros> listaCozinheiros = new ArrayList<Cozinheiros>();
		ArrayList<MaterialDidatico> listaMatD = new ArrayList<MaterialDidatico>();
		ArrayList<MaterialEscolar> listaMatE = new ArrayList<MaterialEscolar>();
		ArrayList<MaterialLimpeza> listaMatL = new ArrayList<MaterialLimpeza>();
		ArrayList<Materiais> listaMat = new ArrayList<Materiais>();
		
		//Start
		while (escolhaMenu != 7) {
			System.out.println("Escolha uma opcao:");
			System.out.println("1. Cadastrar");
			System.out.println("2. Atualizar");
			System.out.println("3. Remover");
			System.out.println("4. Locacao de Recursos");
			System.out.println("5. Consulta");
			System.out.println("6. Relatorio Atual");
			System.out.println("7. Sair do Sistema");
			escolhaMenu = ler.nextInt();
			ler.nextLine();
			//Create
			if( escolhaMenu == 1) {
				int cadastroTipo = 0;
				int escolhaCadastro = 0;
				while(cadastroTipo != 3) {
					System.out.println("Escolha um Tipo de Recurso:");
					System.out.println("1. Recurso Humano");
					System.out.println("2. Recurso Material");
					System.out.println("3. Voltar ao menu inicial");
					cadastroTipo = ler.nextInt();
					ler.nextLine();
					if(cadastroTipo == 1) {
						while (escolhaCadastro != 7) {
							System.out.println("Escolha o Recurso humano a ser cadastrado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaCadastro = ler.nextInt();
							ler.nextLine();
								if(escolhaCadastro == 1) {
									Alunos aluno =new Alunos();
									System.out.println("Cadastro de aluno(a):");
									System.out.println("Escreva o nome do aluno(a):");
									aluno.setNome(ler.nextLine());
									System.out.println("Escreva o ID do aluno(a):");
									aluno.setId(ler.nextInt());
									ler.nextLine();
									listaAlunos.add(aluno);
									numHumanos++;
									numAlunos++;
									System.out.println("Aluno(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 2) {
									Cozinheiros cozinheiro =new Cozinheiros();
									System.out.println("Cadastro de cozinheiro(a):");
									System.out.println("Escreva o nome do cozinheiro(a):");
									cozinheiro.setNome(ler.nextLine());
									System.out.println("Escreva o ID do cozinheiro(a):");
									cozinheiro.setId(ler.nextInt());
									ler.nextLine();
									listaCozinheiros.add(cozinheiro);
									numHumanos++;
									numCozinheiros++;
									System.out.println("Cozinheiro(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 3) {
									Instrutores instrutor =new Instrutores();
									System.out.println("Cadastro de instrutor(a):");
									System.out.println("Escreva o nome do instrutor(a):");
									instrutor.setNome(ler.nextLine());
									System.out.println("Escreva o ID do instrutor(a):");
									instrutor.setId(ler.nextInt());
									ler.nextLine();
									listaInstrutores.add(instrutor);
									numHumanos++;
									numInstrutores++;
									System.out.println("Instrutor(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 4) {
									Monitores monitor =new Monitores();
									System.out.println("Cadastro de monitor(a):");
									System.out.println("Escreva o nome do monitor(a):");
									monitor.setNome(ler.nextLine());
									System.out.println("Escreva o ID do monitor(a):");
									monitor.setId(ler.nextInt());
									ler.nextLine();
									listaMonitores.add(monitor);
									numHumanos++;
									numMonitores++;
									System.out.println("Monitor(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 5) {
									Professores professor =new Professores();
									System.out.println("Cadastro de professor(a):");
									System.out.println("Escreva o nome do professor(a):");
									professor.setNome(ler.nextLine());
									System.out.println("Escreva o ID do professor(a):");
									professor.setId(ler.nextInt());
									ler.nextLine();
									listaProfessores.add(professor);
									numHumanos++;
									numProfessores++;
									System.out.println("Professor(a) cadastrado com sucesso!\n");
						
								}
								else if(escolhaCadastro == 6) {
									Serventes servente =new Serventes();
									System.out.println("Cadastro de servente:");
									System.out.println("Escreva o nome do servente:");
									servente.setNome(ler.nextLine());
									System.out.println("Escreva o ID do servente:");
									servente.setId(ler.nextInt());
									ler.nextLine();
									listaServentes.add(servente);
									numHumanos++;
									numServentes++;
									System.out.println("Servente cadastrado com sucesso!\n");
						
								}
						
			}
			}
				else if (cadastroTipo == 2) {
					while (escolhaCadastro != 4) {
						System.out.println("Escolha o Recurso material a ser cadastrado:");
						System.out.println("1. Material Didatico");
						System.out.println("2. Material Escolar");
						System.out.println("3. Material de Limpeza");
						System.out.println("4. Voltar ao menu anterior");
						escolhaCadastro = ler.nextInt();
						ler.nextLine();
						if(escolhaCadastro == 1) {
							String nome;
							int qntd;
							System.out.println("Escreva o nome do material didatico a ser cadastrado:");
							nome = ler.nextLine();
							int i = 0;
							for(MaterialDidatico didaticos: listaMatD) {
								if(nome.equals(didaticos.getNome())) {
									System.out.println("Material j� cadastrado.\n");
									i++;
									break;
								}
							}
							if(i != 0) {
								break;
							}
							else {
							System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
							qntd = ler.nextInt();
							ler.nextLine();
							numMatD = numMatD + qntd;
							MaterialDidatico didatico =new MaterialDidatico(nome, qntd);
							listaMatD.add(didatico);
							System.out.println("Material cadastrado com sucesso!\n");
							}
						}
						else if(escolhaCadastro == 2) {
							String nome;
							int qntd;
							System.out.println("Escreva o nome do material escolar a ser cadastrado:");
							nome = ler.nextLine();
							int i = 0;
							for(MaterialEscolar escolares: listaMatE) {
								if(nome.equals(escolares.getNome())) {
									System.out.println("Material j� cadastrado.");
									i++;
									break;
								}
							}
							if(i != 0) {
								break;
							}
							else {
							System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
							qntd = ler.nextInt();
							ler.nextLine();
							numMatE = numMatE + qntd;
							MaterialEscolar escolar =new MaterialEscolar(nome, qntd);
							listaMatE.add(escolar);
							System.out.println("Material cadastrado com sucesso!\n");
							}
						}
						else if(escolhaCadastro == 3) {
							String nome;
							int qntd;
							System.out.println("Escreva o nome do material de limpeza a ser cadastrado:");
							nome = ler.nextLine();
							int i = 0;
							for(MaterialLimpeza limpezas: listaMatL) {
								if(nome.equals(limpezas.getNome())) {
									System.out.println("Material j� cadastrado.");
									i++;
									break;
								}
							}
							if(i != 0) {
								break;
							}
							else {
							System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
							qntd = ler.nextInt();
							ler.nextLine();
							numMatL = numMatL + qntd;
							MaterialLimpeza limpeza =new MaterialLimpeza(nome, qntd);
							listaMatL.add(limpeza);
							System.out.println("Material cadastrado com sucesso!\n");
							}
						}
				}
				}
			}
			}
			//Update
			else if(escolhaMenu == 2) {
				int escolhaAtualizar = 0;
				while (escolhaAtualizar != 3) {
					System.out.println("Escolha o Tipo de Altera��o:");
					System.out.println("1. Por Recurso Humano");
					System.out.println("2. Por Recurso Material");
					System.out.println("3. Voltar ao Menu inicial");
					escolhaAtualizar = ler.nextInt();
					ler.nextLine();
				
					if(escolhaAtualizar == 1) {
						int escolhaAtualizarH = 0;
						while (escolhaAtualizarH != 7) {
							System.out.println("Escolha o Recurso Humano a ser alterado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaAtualizarH = ler.nextInt();
							ler.nextLine();
							if(escolhaAtualizarH == 1) {
								Alunos aluno = new Alunos();
								if(listaAlunos.size() == 0) {
									System.out.println("N�o existem alunos(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do aluno(a) a ser alterado:");
									aluno.setNome(ler.nextLine());
									int ID = aluno.getId();
									int i = 0;
									for(Alunos alunos: listaAlunos) {
										if(ID == alunos.getId()) {
											System.out.println("Digite o novo nome do aluno(a)");
											alunos.setNome(ler.nextLine());
											break;
										} else if(!(ID == alunos.getId()) && i == listaAlunos.size()-1){
											System.out.println("\nN�o existe cadastro desse aluno(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 2) {
								Cozinheiros cozinheiro = new Cozinheiros();
								if(listaCozinheiros.size() == 0) {
									System.out.println("N�o existem cozinheiros(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do cozinheiro(a) a ser alterado:");
									cozinheiro.setNome(ler.nextLine());
									int ID = cozinheiro.getId();
									int i = 0;
									for(Cozinheiros cozinheiros: listaCozinheiros) {
										if(ID==cozinheiros.getId()) {
											System.out.println("Digite o novo nome do cozinheiro(a)");
											cozinheiros.setNome(ler.nextLine());
											break;
										} else if(!(ID==cozinheiros.getId()) && i == listaCozinheiros.size()-1){
											System.out.println("\nN�o existe cadastro desse cozinheiro(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 3) {
								Instrutores instrutor = new Instrutores();
								if(listaInstrutores.size() == 0) {
									System.out.println("N�o existem instrutores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do instrutor(a) a ser alterado:");
									instrutor.setNome(ler.nextLine());
									int ID = instrutor.getId();
									int i = 0;
									for(Instrutores instrutores: listaInstrutores) {
										if(ID==instrutores.getId()) {
											System.out.println("Digite o novo nome do instrutor(a)");
											instrutores.setNome(ler.nextLine());
											break;
										} else if(!(ID==instrutores.getId()) && i == listaInstrutores.size()-1){
											System.out.println("\nN�o existe cadastro desse instrutor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 4) {
								Monitores monitor = new Monitores();
								if(listaMonitores.size() == 0) {
									System.out.println("N�o existem monitores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do monitor(a) a ser alterado:");
									monitor.setNome(ler.nextLine());
									int ID = monitor.getId();
									int i = 0;
									for(Monitores monitores: listaMonitores) {
										if(ID==monitores.getId()) {
											System.out.println("Digite o novo nome do monitor(a)");
											monitores.setNome(ler.nextLine());
											break;
										} else if(!(ID==monitores.getId()) && i == listaMonitores.size()-1){
											System.out.println("\nN�o existe cadastro desse monitor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 5) {
								Professores professor = new Professores();
								if(listaProfessores.size() == 0) {
									System.out.println("N�o existem professores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do professor(a) a ser alterado:");
									professor.setNome(ler.nextLine());
									int ID = professor.getId();
									int i = 0;
									for(Professores professores: listaProfessores) {
										if(ID==professores.getId()) {
											System.out.println("Digite o novo nome do professor(a)");
											professores.setNome(ler.nextLine());
											break;
										} else if(!(ID==professores.getId()) && i == listaProfessores.size()-1){
											System.out.println("\nN�o existe cadastro desse professor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaAtualizarH == 6) {
								Serventes servente = new Serventes();
								if(listaServentes.size() == 0) {
									System.out.println("N�o existem serventes(as) cadastrados.\n");		
								}
								else {
									System.out.println("Digite o ID do servente(a) a ser alterado:");
									servente.setNome(ler.nextLine());
									int ID = servente.getId();
									int i = 0;
									for(Serventes serventes: listaServentes) {
										if(ID==serventes.getId()) {
											System.out.println("Digite o novo nome do servente");
											serventes.setNome(ler.nextLine());
											break;
										} else if(!(ID==serventes.getId()) && i == listaServentes.size()-1){
											System.out.println("\nN�o existe cadastro desse servente no sistema.\n");
										}
										i++;
									}
								}
							}
							}
			}
					else if(escolhaAtualizar == 2) {
						int escolhaAtualizarM = 0;
						while (escolhaAtualizarM != 4) {
							System.out.println("Escolha o Recurso material a ser alterado:");
							System.out.println("1. Material Didatico");
							System.out.println("2. Material Escolar");
							System.out.println("3. Material de Limpeza");
							System.out.println("4. Voltar ao menu anterior");
							escolhaAtualizarM = ler.nextInt();
							ler.nextLine();
							if(escolhaAtualizarM == 1) {
								String nome;
								System.out.println("Escreva o nome do material didatico a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialDidatico didaticos: listaMatD) {
									if(nome.equals(didaticos.getNome())) {
										numMatD = numMatD - didaticos.getQntd();
										System.out.println("Digite o novo nome do material:");
										didaticos.setNome(ler.nextLine());
										System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
										didaticos.setQntd(ler.nextInt());
										numMatD = numMatD - didaticos.getQntd();
										break;
									}else if(!nome.equals(didaticos.getNome()) && i == listaMatD.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaAtualizarM == 2) {
								String nome;
								System.out.println("Escreva o nome do material escolar a ser alterado:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialEscolar escolares: listaMatE) {
									if(nome.equals(escolares.getNome())) {
										numMatE = numMatE - escolares.getQntd();
										System.out.println("Digite o novo nome do material:");
										escolares.setNome(ler.nextLine());
										System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
										escolares.setQntd(ler.nextInt());
										numMatE = numMatE - escolares.getQntd();
										break;
									}else if(!nome.equals(escolares.getNome()) && i == listaMatE.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaAtualizarM == 3) {
								String nome;
								System.out.println("Escreva o nome do material de limpeza a ser alterado:");
								nome = ler.nextLine();
								int i = 0;

								for(MaterialLimpeza limpezas: listaMatL) {
									if(nome.equals(limpezas.getNome())) {
										numMatL = numMatL - limpezas.getQntd();
										System.out.println("Digite o novo nome do material:");
										limpezas.setNome(ler.nextLine());
										System.out.println("Escreva a quantidade a ser adicionado desse material:"); 
										limpezas.setQntd(ler.nextInt());
										numMatL = numMatL + limpezas.getQntd();
										break;
									}else if(!nome.equals(limpezas.getNome()) && i == listaMatL.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							}
							
						
					}
					}
				}
			//Delete
			else if(escolhaMenu == 3) {
				int escolhaRemover = 0;
				while (escolhaRemover != 3) {
					System.out.println("Escolha o Tipo de Consulta:");
					System.out.println("1. Por Recurso Humano");
					System.out.println("2. Por Recurso Material");
					System.out.println("3. Voltar ao Menu");
					escolhaRemover = ler.nextInt();
					ler.nextLine();
					if(escolhaRemover == 1) {
						int escolhaRemoverH = 0;
						while (escolhaRemoverH != 7) {
							System.out.println("Escolha o Recurso Humano a ser consultado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaRemoverH = ler.nextInt();
							ler.nextLine();
							
							if(escolhaRemoverH == 1) {
								Alunos aluno = new Alunos();
								if(listaAlunos.size() == 0) {
									System.out.println("N�o existem alunos(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do aluno(a) a ser removido:");
									aluno.setId(ler.nextInt());
									ler.nextLine();
									int ID = aluno.getId();
									int i = 0;
									for(Alunos alunos: listaAlunos) {
										if((ID==alunos.getId())) {
											listaAlunos.remove(alunos);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										}else if(!(ID==alunos.getId()) && i == listaAlunos.size()-1){
											System.out.println("\nN�o existe cadastro desse aluno(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 2) {
								Cozinheiros cozinheiro = new Cozinheiros();
								if(listaCozinheiros.size() == 0) {
									System.out.println("N�o existem cozinheiros(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do cozinheiro(a) a ser removido:");
									cozinheiro.setId(ler.nextInt());
									ler.nextLine();
									int ID = cozinheiro.getId();
									int i = 0;
									for(Cozinheiros cozinheiros: listaCozinheiros) {
										if((ID==cozinheiros.getId())) {
											listaCozinheiros.remove(cozinheiros);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==cozinheiros.getId()) && i == listaCozinheiros.size()-1){
											System.out.println("\nN�o existe cadastro desse cozinheiro(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 3) {
								Instrutores instrutor = new Instrutores();
								if(listaInstrutores.size() == 0) {
									System.out.println("N�o existem instrutores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do instrutor(a) a ser removido:");
									instrutor.setId(ler.nextInt());
									ler.nextLine();
									int ID = instrutor.getId();
									int i = 0;
									for(Instrutores instrutores: listaInstrutores) {
										if((ID==instrutores.getId())) {
											listaInstrutores.remove(instrutores);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==instrutores.getId()) && i == listaInstrutores.size()-1){
											System.out.println("\nN�o existe cadastro desse instrutor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 4) {
								Monitores monitor = new Monitores();
								if(listaMonitores.size() == 0) {
									System.out.println("N�o existem monitores(as) cadastrados.");		
								}
								else {
									System.out.println("Digite o ID do monitor(a) a ser removido:");
									monitor.setId(ler.nextInt());
									ler.nextLine();
									int ID = monitor.getId();
									int i = 0;
									for(Monitores monitores: listaMonitores) {
										if((ID==monitores.getId())) {
											listaMonitores.remove(monitores);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==monitores.getId()) && i == listaMonitores.size()-1){
											System.out.println("\nN�o existe cadastro desse monitor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 5) {
								Professores professor = new Professores();
								if(listaProfessores.size() == 0) {
									System.out.println("N�o existem professores(as) removido.");		
								}
								else {
									System.out.println("Digite o ID do professor(a) a ser consultado:");
									professor.setId(ler.nextInt());
									ler.nextLine();
									int ID = professor.getId();
									int i = 0;
									for(Professores professores: listaProfessores) {
										if((ID==professores.getId())) {
											listaProfessores.remove(professores);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==professores.getId()) && i == listaProfessores.size()-1){
											System.out.println("\nN�o existe cadastro desse professor(a) no sistema.\n");
										}
										i++;
									}
								}
							}
							else if(escolhaRemoverH == 6) {
								Serventes servente = new Serventes();
								if(listaServentes.size() == 0) {
									System.out.println("N�o existem serventes(as) removido.");		
								}
								else {
									System.out.println("Digite o ID do servente(a) a ser consultado:");
									servente.setId(ler.nextInt());
									ler.nextLine();
									int ID = servente.getId();
									int i = 0;
									for(Serventes serventes: listaServentes) {
										if((ID==serventes.getId())) {
											listaServentes.remove(serventes);
											numAlunos--;
											numHumanos--;
											System.out.println("Removido com sucesso.");
											break;
										} else if(!(ID==serventes.getId()) && i == listaServentes.size()-1){
											System.out.println("\nN�o existe cadastro desse servente no sistema.\n");
										}
										i++;
									}
								}
							}
							
					}
					}
					else if(escolhaRemover == 2) {
						int escolhaRemoverM = 0;
						while (escolhaRemoverM != 4) {
							System.out.println("Escolha o Recurso material a ser cadastrado:");
							System.out.println("1. Material Didatico");
							System.out.println("2. Material Escolar");
							System.out.println("3. Material de Limpeza");
							System.out.println("4. Voltar ao menu anterior");
							escolhaRemoverM = ler.nextInt();
							ler.nextLine();
							if(escolhaRemoverM == 1) {
								String nome;
								System.out.println("Escreva o nome do material didatico a ser removido:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialDidatico didaticos: listaMatD) {
									if(nome.equals(didaticos.getNome())) {
										numMatD = numMatD - didaticos.getQntd();
										listaMatD.remove(didaticos);
										System.out.println("Removido com sucesso.");
										break;
									}else if(!nome.equals(didaticos.getNome()) && i == listaMatD.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaRemoverM == 2) {
								String nome;
								System.out.println("Escreva o nome do material escolar a ser removido:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialEscolar escolares: listaMatE) {
									if(nome.equals(escolares.getNome())) {
										numMatE = numMatE - escolares.getQntd();
										listaMatE.remove(escolares);
										System.out.println("Removido com sucesso.");
										break;
									}else if(!nome.equals(escolares.getNome()) && i == listaMatE.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
							else if(escolhaRemoverM == 3) {
								String nome;
								System.out.println("Escreva o nome do material de limpeza a ser removido:");
								nome = ler.nextLine();
								int i = 0;
								for(MaterialLimpeza limpezas: listaMatL) {
									if(nome.equals(limpezas.getNome())) {
										numMatL = numMatL - limpezas.getQntd();
										listaMatL.remove(limpezas);
										System.out.println("Removido com sucesso.");
										break;
									}else if(!nome.equals(limpezas.getNome()) && i == listaMatL.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								}
					}
					}
			}
			
				
			}
			//Loca��o Recursos
			else if(escolhaMenu == 4) {		
						int escolhaLocM = 0;
						while(escolhaLocM != 4) {
							System.out.println("Escolha o tipo do material para atribuir ao recurso humano:");
							System.out.println("1. Material Didatico");
							System.out.println("2. Material Escolar");
							System.out.println("3. Material de Limpeza");
							System.out.println("4. Voltar ao menu inicial");
							escolhaLocM = ler.nextInt();
							ler.nextLine();
							if(escolhaLocM == 1) {
								String nome;
								String humano;
								int i = 0;
								int qntd = 0;
								int qntdAnt = 0;
								System.out.println("Escreva qual recurso humano recebera os materiais:");
								humano = ler.nextLine();
								System.out.println("Escreva o nome do material:");
								nome = ler.nextLine();
								for(MaterialDidatico didaticos: listaMatD) {
									if(nome.equals(didaticos.getNome())) {
										System.out.println("Existem "+didaticos.getQntd()+" do material escolhido");
										System.out.println("Escreva a quantidade a ser distribuida:");
										qntd = ler.nextInt();
										ler.nextLine();
										qntdAnt = didaticos.getQntd();
										if(qntd > qntdAnt) {
											System.out.println("\nQuantidade n�o disponivel\n");
										}
										if(qntd == qntdAnt) {
											Materiais mat = new Materiais(nome, qntd);			
											mat.setHumano(humano);
											listaMat.add(mat);
											listaMatD.remove(didaticos);
											numMatD = numMatD - qntd;
											System.out.println("Materiais atribuidos com sucesso");
										}
										else {
											Materiais mat = new Materiais(nome, qntd);			
											mat.setHumano(humano);
											listaMat.add(mat);
											didaticos.setQntd(qntdAnt - qntd);
											numMatD = numMatD - qntd;
											System.out.println("Materiais atribuidos com sucesso");
										}
										break;
									}else if(!nome.equals(didaticos.getNome()) && i == listaMatD.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								
							}
							if(escolhaLocM == 2) {
								String nome;
								String humano;
								int i = 0;
								int qntd = 0;
								int qntdAnt = 0;
								System.out.println("Escreva qual recurso humano recebera os materiais:");
								humano = ler.nextLine();
								System.out.println("Escreva o nome do material:");
								nome = ler.nextLine();
								for(MaterialEscolar escolares: listaMatE) {
									if(nome.equals(escolares.getNome())) {
										System.out.println("Existem "+escolares.getQntd()+" do material escolhido");
										System.out.println("Escreva a quantidade a ser distribuida:");
										qntd = ler.nextInt();
										ler.nextLine();
										qntdAnt = escolares.getQntd();
										if(qntd > qntdAnt) {
											System.out.println("\nQuantidade n�o disponivel\n");
										}
										if(qntd == qntdAnt) {
											Materiais mat = new Materiais(nome, qntd);			
											mat.setHumano(humano);
											listaMat.add(mat);
											listaMatE.remove(escolares);
											numMatE = numMatE - qntd;
											System.out.println("Materiais atribuidos com sucesso");
										}
										else {
											Materiais mat = new Materiais(nome, qntd);			
											mat.setHumano(humano);
											listaMat.add(mat);
											escolares.setQntd(qntdAnt - qntd);
											numMatE = numMatE - qntd;
											System.out.println("Materiais atribuidos com sucesso");
										}
										break;
									}else if(!nome.equals(escolares.getNome()) && i == listaMatE.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								
							}
							if(escolhaLocM == 3) {
								String nome;
								String humano;
								int i = 0;
								int qntd = 0;
								int qntdAnt = 0;
								System.out.println("Escreva qual recurso humano recebera os materiais:");
								humano = ler.nextLine();
								System.out.println("Escreva o nome do material:");
								nome = ler.nextLine();
								for(MaterialLimpeza limpezas: listaMatL) {
									if(nome.equals(limpezas.getNome())) {
										System.out.println("Existem "+limpezas.getQntd()+" do material escolhido");
										System.out.println("Escreva a quantidade a ser distribuida:");
										qntd = ler.nextInt();
										ler.nextLine();
										qntdAnt = limpezas.getQntd();
										if(qntd > qntdAnt) {
											System.out.println("\nQuantidade n�o disponivel\n");
										}
										if(qntd == qntdAnt) {
											Materiais mat = new Materiais(nome, qntd);			
											mat.setHumano(humano);
											listaMat.add(mat);
											listaMatL.remove(limpezas);
											numMatL = numMatL - qntd;
											System.out.println("Materiais atribuidos com sucesso");
										}
										else {
											Materiais mat = new Materiais(nome, qntd);			
											mat.setHumano(humano);
											listaMat.add(mat);
											limpezas.setQntd(qntdAnt - qntd);
											numMatL = numMatL - qntd;
											System.out.println("Materiais atribuidos com sucesso");
										}
										break;
									}else if(!nome.equals(limpezas.getNome()) && i == listaMatL.size()-1){
										System.out.println("\nN�o existe cadastro desse material no sistema.\n");
									}
									i++;
								}
								
							}
						}
					
				
				
				
			}
			//Read
			else if(escolhaMenu == 5) {
				int escolhaConsulta = 0;
				while (escolhaConsulta != 3) {
					System.out.println("Escolha o Tipo de Consulta:");
					System.out.println("1. Por Recurso Humano");
					System.out.println("2. Por Recurso Material");
					System.out.println("3. Voltar ao Menu");
					escolhaConsulta = ler.nextInt();
					ler.nextLine();
					if(escolhaConsulta == 1) {
						int escolhaConsultaH = 0;
						while (escolhaConsultaH != 7) {
							System.out.println("Escolha o Recurso Humano a ser consultado:");
							System.out.println("1. Aluno(a)");
							System.out.println("2. Cozinheiro(a)");
							System.out.println("3. Instrutor(a)");
							System.out.println("4. Monitor(a)");
							System.out.println("5. Professor(a)");
							System.out.println("6. Servente");
							System.out.println("7. Voltar ao menu anterior");
							escolhaConsultaH = ler.nextInt();
							ler.nextLine();
							
							if(escolhaConsultaH == 1) {
								if(listaAlunos.size() == 0) {
									System.out.println("N�o existem alunos(as) cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");	
									for(Alunos alunos: listaAlunos) {
										System.out.println(alunos.toString());
									}
								}
							}
							else if(escolhaConsultaH == 2) {
						
								if(listaCozinheiros.size() == 0) {
									System.out.println("N�o existem cozinheiros(as) cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(Cozinheiros cozinheiros: listaCozinheiros) {
										System.out.println(cozinheiros.toString());
									}
								}
							}
							else if(escolhaConsultaH == 3) {
								if(listaInstrutores.size() == 0) {
									System.out.println("N�o existem instrutores(as) cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(Instrutores instrutores: listaInstrutores) {
										System.out.println(instrutores.toString());
									}
								}
							}
							else if(escolhaConsultaH == 4) {
								if(listaMonitores.size() == 0) {
									System.out.println("N�o existem monitores(as) cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(Monitores monitores: listaMonitores) {
											System.out.println(monitores.toString());
								}
							}
							}
							else if(escolhaConsultaH == 5) {
								if(listaProfessores.size() == 0) {
									System.out.println("N�o existem professores(as) cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(Professores professores: listaProfessores) {
										System.out.println(professores.toString());
									}
								}
							}
							else if(escolhaConsultaH == 6) {						
								if(listaServentes.size() == 0) {
									System.out.println("N�o existem serventes(as) cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(Serventes serventes: listaServentes) {
										System.out.println(serventes.toString());
									}
								}
							}
							
					}
					}
					else if(escolhaConsulta == 2) {
						int escolhaConsultaM = 0;
						while (escolhaConsultaM != 4) {
							System.out.println("Escolha o Recurso material a ser consultado:");
							System.out.println("1. Material Didatico");
							System.out.println("2. Material Escolar");
							System.out.println("3. Material de Limpeza");
							System.out.println("4. Voltar ao menu anterior");
							escolhaConsultaM = ler.nextInt();
							ler.nextLine();
							if(escolhaConsultaM == 1) {
								if(listaMatD.size() == 0) {
									System.out.println("N�o existem materiais cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(MaterialDidatico didaticos: listaMatD) {
										System.out.println("Nome do recurso material: "+didaticos.getNome() 
										+"\nQuantidade desse recurso: "+didaticos.getQntd()+"\n");
								}
								}
							}
							else if(escolhaConsultaM == 2) {
								if(listaMatE.size() == 0) {
									System.out.println("N�o existem materiais cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(MaterialEscolar escolares: listaMatE) {
										System.out.println("Nome do recurso material: "+escolares.getNome() 
										+"\nQuantidade desse recurso: "+escolares.getQntd()+"\n"  );
								}
								}
							}
						
							else if(escolhaConsultaM == 3) {
								if(listaMatL.size() == 0) {
									System.out.println("N�o existem materiais cadastrados.");		
								}
								else {
									System.out.println("Consulta: ");
									for(MaterialLimpeza limpezas: listaMatL) {
										System.out.println("Nome do recurso material: "+limpezas.getNome() 
										+"\nQuantidade desse recurso: "+limpezas.getQntd()+"\n"  );
								}
								}
							}
					}
					}
			}
			}
			//Relatorio
			else if(escolhaMenu == 6) {
				System.out.println("N�mero de Recursos Humanos: "+numHumanos );
				System.out.println("N�mero de Alunos: "+numAlunos );
				System.out.println("N�mero de Cozinheiros: "+numCozinheiros );
				System.out.println("N�mero de Instrutores: "+numInstrutores );
				System.out.println("N�mero de Monitores: "+numMonitores );
				System.out.println("N�mero de Professores: "+numProfessores );
				System.out.println("N�mero de Serventes: "+numServentes );
				System.out.println("N�mero de Materiais Didaticos: "+numMatD );
				System.out.println("N�mero de Materiais Escolares: "+numMatE );
				System.out.println("N�mero de Materiais de Limpeza: "+numMatL );
			//	System.out.println("\nInventario de materiais:");
		//		for(Materiais mat: listaMat) {
			//		System.out.println("Recurso "+mat.getNome() 
		//			+" com quantidade "+mat.getQntd()+" atribuidos para "+mat.getHumano()+".\n");
		//	}
			}
		
	}
		ler.close();
		}
		}
	

