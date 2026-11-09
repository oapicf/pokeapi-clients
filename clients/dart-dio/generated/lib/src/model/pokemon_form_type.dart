//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/type_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_type.g.dart';

/// PokemonFormType
///
/// Properties:
/// * [slot] - The order the Pokémon's types are listed in.
/// * [type] - The type the referenced Form has.
@BuiltValue()
abstract class PokemonFormType implements Built<PokemonFormType, PokemonFormTypeBuilder> {
  /// The order the Pokémon's types are listed in.
  @BuiltValueField(wireName: r'slot')
  int get slot;

  /// The type the referenced Form has.
  @BuiltValueField(wireName: r'type')
  TypeSummary get type;

  PokemonFormType._();

  factory PokemonFormType([void updates(PokemonFormTypeBuilder b)]) = _$PokemonFormType;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormTypeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormType> get serializer => _$PokemonFormTypeSerializer();
}

class _$PokemonFormTypeSerializer implements PrimitiveSerializer<PokemonFormType> {
  @override
  final Iterable<Type> types = const [PokemonFormType, _$PokemonFormType];

  @override
  final String wireName = r'PokemonFormType';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormType object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'slot';
    yield serializers.serialize(
      object.slot,
      specifiedType: const FullType(int),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(TypeSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormType object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormTypeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'slot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.slot = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeSummary),
          ) as TypeSummary;
          result.type.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormType deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormTypeBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


