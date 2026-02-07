#tag Class
Protected Class StatDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		game_index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		is_battle_only As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		affecting_moves As OpenAPIClient.Models.StatDetailAffectingMoves
	#tag EndProperty


	#tag Property, Flags = &h0
		affecting_natures As OpenAPIClient.Models.StatDetailAffectingNatures
	#tag EndProperty


	#tag Property, Flags = &h0
		characteristics() As OpenAPIClient.Models.CharacteristicSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		move_damage_class As OpenAPIClient.Models.MoveDamageClassSummary
	#tag EndProperty


	#tag Property, Flags = &h0
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
			Type="StatDetailAffectingMoves"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="affecting_natures"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="StatDetailAffectingNatures"
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


