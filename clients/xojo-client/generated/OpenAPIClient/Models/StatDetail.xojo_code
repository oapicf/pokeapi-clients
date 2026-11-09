#tag Class
Protected Class StatDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			ID the games use for this stat.
		#tag EndNote
		game_index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether this stat only exists within a battle.
		#tag EndNote
		is_battle_only As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A detail of moves which affect this stat positively or negatively.
		#tag EndNote
		affecting_moves As OpenAPIClient.Models.StatAffectingMoves
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A detail of natures which affect this stat positively or negatively.
		#tag EndNote
		affecting_natures As OpenAPIClient.Models.StatAffectingNatures
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Items that affect this stat, such as vitamins and battle items.
		#tag EndNote
		affecting_items() As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
		#tag EndNote
		characteristics() As OpenAPIClient.Models.CharacteristicSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The class of damage this stat is directly related to.
		#tag EndNote
		move_damage_class As OpenAPIClient.Models.MoveDamageClassSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.StatName
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="game_index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_battle_only"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="affecting_moves"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatAffectingMoves"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="affecting_natures"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatAffectingNatures"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="affecting_items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="characteristics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CharacteristicSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move_damage_class"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveDamageClassSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatName"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


